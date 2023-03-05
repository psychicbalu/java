$(document).ready(function () {
  $.getJSON(
    "https://api.github.com/repos/psychicbalu/java/git/trees/main",
    (data) => {
      data["tree"].forEach((element) => {
        if (element["path"] == "programs") {
          $.getJSON(element["url"], (data) => {
            data["tree"].forEach((element1) => {
              $("#codeslist").append(
                "<li><a href='./code.html#" +
                  element1["path"] +
                  "' target='_blank'>" +
                  element1["path"] +
                  "</a></li>"
              );
            });
          });
        }
      });
    }
  );
});

//  $.getJSON('/programs', data => {
//    console.log(data);
//    data.forEach(element => {
//       $("#codeslist").append("<li><a href='/code.html#"+element+"' target='_blank'>"+element+"</a></li>");

//    });
//    });
