const missingNumber = require("../main/missNuber");

describe('testing missingNumber', () => {
    test('should be 2', () => {
        expect(missingNumber([3,0,1])).toEqual(2)
    })
    
});
