/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function siguienteCampo(actual,siguiente,preventDefault){
    $(actual).keydown(function(event){
        if(event.which===13){
            if(preventDefault){
                event.preventExtensions();
            }
        }
    });
    $(siguiente).focus();
    $(siguiente).select();
}