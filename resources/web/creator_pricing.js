$(document).ready(function() {

    var creatorName = window.location.pathname.split('/').pop();
    fillUserHighChartStandardTemplate(creatorName + '/get_pricing', '#pricing', 'Price ($/piece)', '$');



});