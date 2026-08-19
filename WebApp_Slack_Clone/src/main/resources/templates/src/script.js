$(document).ready(function() {
    // Navbar scroll effect
    $(window).scroll(function() {
        if ($(window).scrollTop() > 20) {
            $('#navbar').addClass('shadow-xl py-3').removeClass('py-5');
        } else {
            $('#navbar').removeClass('shadow-xl py-3').addClass('py-5');
        }
    });

    // Mobile menu toggle
    $('#mobile-menu-btn').click(function() {
        $('#mobile-menu').slideToggle();
        const icon = $(this).find('svg');
        if ($(this).hasClass('open')) {
            $(this).removeClass('open');
            // Change back to hamburger icon
            icon.replaceWith('<svg xmlns="http://www.w3.org/2000/svg" width="28" height="28" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="lucide lucide-menu"><line x1="4" x2="20" y1="12" y2="12"/><line x1="4" x2="20" y1="6" y2="6"/><line x1="4" x2="20" y1="18" y2="18"/></svg>');
        } else {
            $(this).addClass('open');
            // Change to X icon
            icon.replaceWith('<svg xmlns="http://www.w3.org/2000/svg" width="28" height="28" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="lucide lucide-x"><path d="M18 6 6 18"/><path d="m6 6 12 12"/></svg>');
        }
    });
    
    // Mega Menu Toggle
    $('#features-toggle').click(function(e) {
        e.preventDefault();
        e.stopPropagation();
        const menu = $('#features-menu');
        const icon = $(this).find('svg');
        
        if (menu.hasClass('opacity-0')) {
            // Open
            menu.removeClass('opacity-0 invisible').addClass('opacity-100 visible translate-y-2');
            icon.addClass('rotate-180');
        } else {
            // Close
            menu.addClass('opacity-0 invisible').removeClass('opacity-100 visible translate-y-2');
            icon.removeClass('rotate-180');
        }
    });

    // Close when clicking outside
    $(document).click(function(e) {
        if (!$(e.target).closest('#features-dropdown-container').length) {
            $('#features-menu').addClass('opacity-0 invisible').removeClass('opacity-100 visible translate-y-2');
            $('#features-toggle svg').removeClass('rotate-180');
        }
    });
    
    // FAQ Accordion
    $('.faq-button').click(function() {
        const content = $(this).next('.faq-content');
        const icon = $(this).find('svg');
        
        // Close others
        $('.faq-content').not(content).slideUp();
        $('.faq-button').not(this).find('svg').removeClass('rotate-180');
        
        // Toggle current
        content.slideToggle();
        icon.toggleClass('rotate-180');
    });
});
