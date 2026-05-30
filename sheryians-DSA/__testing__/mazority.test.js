const majorityElement = require("../main/mazorityElement");

describe('testing majorityElement', () => {
    test('should be 3', () => {
        expect(majorityElement([3, 2, 3])).toEqual(3)
    })
    test('should be 2', () => {
        expect(majorityElement([2, 2, 1, 1, 1, 2, 2])).toEqual(2)
    })
});
