// JavaScript for sending form data to Spring Boot backend
$(document).ready(function() {
    // Function to handle form submission
    $("form").submit(function(event) {
        // Prevent default form submission
        event.preventDefault();

        // Collect form data
        var formData = {
            battery_power: $("#battery_power").val(),
            blue: $("#blue").val(),
            dual_sim: $("#dual_sim").val(),
            fc: $("#fc").val(),
            four_g: $("#four_g").val(),
            int_memory: $("#int_memory").val(),
            m_dep: $("#m_dep").val(),
            mobile_wt: $("#mobile_wt").val(),
            n_cores: $("#n_cores").val(),
            pc: $("#pc").val(),
            px_height: $("#px_height").val(),
            px_width: $("#px_width").val(),
            ram: $("#ram").val(),
            sc_h: $("#sc_h").val(),
            sc_w: $("#sc_w").val(),
            talk_time: $("#talk_time").val(),
            three_g: $("#three_g").val(),
            touch_screen: $("#touch_screen").val(),
            wifi: $("#wifi").val()
        };

        // Send data to Spring Boot backend via AJAX
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/submitData",
            data: JSON.stringify(formData),
            dataType: "json",
            success: function(response) {
                // Handle success response
                console.log("Data sent successfully!");
                console.log(response);
            },
            error: function(xhr, status, error) {
                // Handle error response
                console.error("Error sending data:", error);
            }
        });
    });
});
