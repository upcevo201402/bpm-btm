<html>
<header>
	<title>Site for Desktop</title>
	<!-- http://www.antoniorigo.com/diseno-web-adaptable/ -->
	<link rel="stylesheet" type="text/css" media="screen and (max-device-width: 480px)" href="smartphone.css" />
	<link rel="stylesheet" type="text/css" media="screen and (max-device-width: 800px) and (max-device-height: 480px)" href="tablet.css" />
	<!--link rel="stylesheet" type="text/css" href="core.css" media="screen" /> 
	<link rel="stylesheet" type="text/css" href="print.css" media="print" /-->
</header>
<body>
    <h2>${message}</h2>
    <br/>
    Site preference: ${currentSitePreference} | ${currentDevice}
    <br/><br/>
    View: <a href="?site_preference=tablet">Tablet</a> | <a href="?site_preference=mobile">Mobile</a>
</body>
</html>