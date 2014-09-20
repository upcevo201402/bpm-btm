# == Class:  mysql
#
# Configure mysql
#
# == Authors
#
# Ilver Anache <ilver.anache@gmail.com>
class mysql {
	$root_user = hiera('mysql_root_user', 'root')
	$root_password = hiera('mysql_root_pwd', 'root')
	
	Exec {
		path	=>	'/usr/bin:/usr/sbin:/bin:/sbin'
	}

	exec { 'install_server_compat':
		command => 'sudo rpm -i /vagrant_data/mysql/5.6.20/x86_64/mysql-shared-compat.rpm &',
		logoutput => true
	}

	exec { 'install_server':
		command => 'sudo rpm -i /vagrant_data/mysql/5.6.20/x86_64/mysql-server.rpm &',
		logoutput => true,
		require => Exec['install_server_compat']
	}
	
	exec { 'install_client':
		command => 'sudo rpm -i /vagrant_data/mysql/5.6.20/x86_64/mysql-client.rpm &',
		logoutput => true,
		require => Exec['install_server']
	}

	
#	file { '/tmp/setpassword.txt':
#		content => template('mysql/reset_password.erb'),
#		ensure => 'present'
#	}
	
#	exec { 'setting_default_password':
#		path	=>	'/usr/bin:/usr/sbin:/bin:/sbin',
#		command => 'mysqld_safe --init-file=init.txt &',
#		require => [File['/tmp/setpassword.txt'], Exec['install_client']]
#	}
	
#	service { mysqld:		
#		enable => "true",
#		ensure => "running",
#		require => [Exec['setting_default_password']]
#	}
#
#	$mysql_port = hiera('mysql_port', 3306)
#	firewall { '100 allow tcp access':
#		port   => [$mysql_port],
#		proto  => tcp,
###		action => accept,
#	}
#		
#	file { '/tmp/enable_remote.sql':
#		content => template('mysql/enable_remote_access.erb')
#	}
#	
#	exec { 'enable_remote_root_access':
#		command => "mysql < /tmp/enable_remote.sql",
#		path	=>	'/usr/bin:/usr/sbin:/bin:/sbin',
#		require => [File['/tmp/enable_remote.sql'], Exec['setting_default_password']]
#	}	
}