
$(document).ready(function(){


	sessionId = getCookie("authenticated_session_id");
	console.log(sessionId);

	fillUserHighChartStandardTemplate('get_users_funds_accum', '#users_funds', 'Funds ($)', '$');
	fillTableFromMustache('get_users_transactions', '#transactions_template', '#transactions', '#transactions_table');
});



