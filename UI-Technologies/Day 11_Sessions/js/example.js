

$(document).ready(function () {

    //grep() method filters an array and returns the filtered array
    var items = [10, 20, 30, 10];
    var items = $.grep(items, function (item) {
        return item != '10';
    });
    console.log(items);

    //map() method applies a function to each item in the array, thus returning a modified array.
    var items = [10, 20, 30, 10];
    var items = $.map(items, function (item) {
        if (item == 10)
            return null;
        return item;
    });
    console.log(items);



    
    var includes = $('[data-include]')
    $.each(includes, function () {
        var file = 'html/' + $(this).data('include') + '.html'
        $(this).load(file)
    })

    //Reduce the set of matched elements to those that match the selector or pass the function's test.

    // $( "li" ).filter( ":nth-child(2n)" ).css( "background-color", "red" );


    $(window).on('scroll', function () {
        if ($(window).scrollTop() > 70) {
            $('.site-navigation,.trans-navigation').addClass('header-white');
        } else {
            $('.site-navigation,.trans-navigation').removeClass('header-white');
        }



    });

    //  alert('start ani');
    /*
    $(".mycard").each(function (i) {
        // store the item around for use in the 'timeout' function
        var $item = $(this);
        // execute this function sometime later:
        setTimeout(function () {
            $item.animate({
                opacity: 1
            },
                {
                    easing: 'swing',
                    duration: 1000,
                    complete: function () {

                        if (i == $(".mycard").length - 1)
                            myCallback()
                    }
                });
        }, 500 * i);
        // each element should animate half a second after the last one.
    });
    */

    $.ajax({
        url: 'data/card.json',
        method: "GET",
        dataType: "JSON",
        async: false,
        beforeSend: function (xhr) {

        },

        error: function () { console.log('error') },
        statusCode: {
            404: function () {
                alert("page not found");
            }
        },

        success: function (response) {
            result = response;

            fetchData(result.cards)
        }
    });


});
function fetchData(_card) {
    var _html = "";
 

    for (c in _card) {
        _html += '<div class="col-lg-4 col-sm-6 col-md-6 mycard">'
        _html += '<div class="service-box">'
        _html += '<div class="service-img-icon">'
        _html += '<img src="' + _card[c].imgPath + '" alt="service-icon" class="img-fluid">'
        _html += '</div>'

        _html += '<div class="service-inner">'
        _html += '<h4>' + _card[c].headerText + '</h4>'
        _html += '<p>' + _card[c].bodyText + '</p>'
        _html += '</div>'
        _html += '</div>'
        _html += '</div>'
    }
  
    $('.mycards-container').empty().html(_html)

    $(".mycard").each(function (i) {
        // store the item around for use in the 'timeout' function
        var $item = $(this);
        // execute this function sometime later:
        setTimeout(function () {
            $item.animate({
                opacity: 1
            },
                {
                    easing: 'swing',
                    duration: 1000,
                    complete: function () {

                        if (i == $(".mycard").length - 1)
                            myCallback()
                    }
                });
        }, 500 * i);
        // each element should animate half a second after the last one.
    });
}
function myCallback() {
    console.log('call back')
}