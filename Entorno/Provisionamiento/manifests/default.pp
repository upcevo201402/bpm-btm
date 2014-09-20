# default.php
if versioncmp($::puppetversion,'3.6.1') >= 0 {

  $allow_virtual_packages = hiera('allow_virtual_packages',false)

  Package {
    allow_virtual => $allow_virtual_packages,
  }
}


hiera_include('classes','')

node 'dbserver.home' { }
node 'appserver.home' {}
node 'webserver.home' { Class ['jrockit::usergroup'] -> Class ['jrockit::install8'] }

node 'lbserver.home' { }
node 'gitserver.home' { }