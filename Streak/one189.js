/**
 * @param {string} text
 * @return {number}
 */
var maxNumberOfBalloons = function (text) {
    let temp = "";
    let ans = 0;

    for (let ch of text) {
        if ("balloon".includes(ch)) {
            temp += ch;
        }

        let copy = temp;

        if (
            copy.includes("b") &&
            copy.includes("a") &&
            copy.split("l").length - 1 >= 2 &&
            copy.split("o").length - 1 >= 2 &&
            copy.includes("n")
        ) {
            ans++;

            copy = copy.replace("b", "");
            copy = copy.replace("a", "");
            copy = copy.replace("l", "");
            copy = copy.replace("l", "");
            copy = copy.replace("o", "");
            copy = copy.replace("o", "");
            copy = copy.replace("n", "");

            temp = copy;
        }
    }

    return ans;
};