const findIntersectionValues = require("../main/findIntersectionValues");

describe('testing findIntersectionValues', () => {
    test('should [2,1]', () => {
        expect(findIntersectionValues([1,2,2,1], [2,9])).toEqual([2,1])
    })
    test('should [2,2]', () => {
        expect(findIntersectionValues([1,2,2,1], [2,2])).toEqual([2,2])
    })
    
})
