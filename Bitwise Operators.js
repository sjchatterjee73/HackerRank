// url: https://www.hackerrank.com/challenges/js10-bitwise/problem
var stack = [];
var top = -1;
var result;
function init() {
    result = 0;
}
function isEmpty() {
    return (top == -1);
}
function pop() {
    return stack[top--];
}
function push(n) {
    stack[++top] = n;
}
function addLast(util, n) {
    stack[util] = n;
}
function myFunction(i, n, k) {
    if (n == i)
        return;

    let util = top + 1;
    while (!isEmpty()) {
        let x = pop();
        x = i & x;
        if (x >= result && x < k)
            result = x;
        addLast(util, x);
    }
    top = util - 1;

    pop();
    myFunction(i + 1, n, k);

}
function getMaxLessThanK(n, k) {
    init();
    for (var x = n; x >= 2; x--) {
        push(x);
    }

    myFunction(1, n, k);
    return result;
}
