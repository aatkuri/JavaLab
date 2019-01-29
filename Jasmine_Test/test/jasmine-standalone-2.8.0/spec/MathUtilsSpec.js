/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open ahe template in the editor.
 */

describe("This is a suite to test MathUtils", function () {
    var mathObj;
    var myTestAmount = 5;
    //This will be called before running each spec
    beforeEach(function () {

        jasmine.addMatchers({
            toBeMoreThan: function () {
                return {
                    compare: function (actual, expected) {
                        var result = {};
                        result.pass = (actual > expected);
                        result.message = 'sorry condition failed';
                        return result;
                    }
                };
            },
            toBeLessThan: function () {
                return {
                    compare: function (actual, expected) {
                        var result = {};
                        result.pass = (actual < expected);
                        result.message = 'sorry condition failed. ';
                        return result;
                    }
                };
            }

        });
    });
    
    it("should be greater or less than myTestAmount", function () {
        expect(10).toBeMoreThan(myTestAmount);
        expect(myTestAmount).toBeLessThan(10);
    });
    describe("when calc is used to peform basic math operations", function () {

        beforeEach(function () {
            mathObj = new MathUtils();
        });
        //Spec for sum operation
        it("should be able to calculate sum of 3 and 5", function () {
            expect(mathObj.sum(3, 5)).toEqual(9);
        });
        //Spec for multiply operation
        it("should be able to multiply 10 and 40", function () {
            expect(mathObj.multiply(10, 40)).toEqual(400);
        });
        //Spec for factorial operation for positive number
        it("should be able to calculate factorial of 9", function () {
            expect(mathObj.factorial(9)).toEqual(362880);
        });
        //Spec for factorial operation for negative number
        it("should be able to throw error in factorial operation when the number is negative", function () {
            expect(function () {
                mathObj.factorial(-7)
            }).toThrowError(Error);
        });
    });
});
