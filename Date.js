//url: https://www.hackerrank.com/challenges/js10-date/problem
function getDayName(dateString) {
    let dayName;
    // Write your code here
    var days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    var d = new Date(dateString);
    dayName = days[d.getDay()];
    return dayName;
}
