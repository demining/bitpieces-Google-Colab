$(document).ready(function() {

    var creatorName = getParameterByName('creator');
    fillSimpleText(creatorName + '/get_main_body', '#main_body');

    // fillFieldFromMustache(creatorName + '/get_main_body', 
    //     '#worth_current_template' , '#worth_current', true);



    // fillFieldFromMustache(creatorName + '/get_pieces_owned_value_current_by_creator', 
    //     '#worth_current_template' , '#worth_current', true);

    // fillFieldFromMustache(creatorName + '/get_main_body_by_creator', 
    //     '#worth_current_template' , '#worth_current', true);


fillFieldFromMustache(creatorName + '/get_pieces_owned_value_current_by_creator', 
    '#worth_current_template' , '#worth_current', true);
fillFieldFromMustache(creatorName + '/get_price_per_piece_current', 
    '#price_per_piece_current_template' , '#price_per_piece_current', true);
fillFieldFromMustache(creatorName + '/get_rewards_owed', 
    '#rewards_paid_template' , '#rewards_paid', true);
fillFieldFromMustache(creatorName + '/get_backers_current_count', 
    '#backers_current_count_template' , '#backers_current_count', false);


});