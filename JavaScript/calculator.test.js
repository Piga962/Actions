const Calculator = require('./calculator');

describe('Calculator', () => {
  let calculator;

  beforeEach(() => {
    calculator = new Calculator();
  });

  test('adds two numbers correctly', () => {
    expect(calculator.add(2, 3)).toBe(5);
    expect(calculator.add(-1, 1)).toBe(0);
    expect(calculator.add(-2, -3)).toBe(-5);
  });

  test('subtracts two numbers correctly', () => {
    expect(calculator.subtract(5, 3)).toBe(2);
    expect(calculator.subtract(1, 5)).toBe(-4);
    expect(calculator.subtract(-2, -3)).toBe(1);
  });

  test('multiplies two numbers correctly', () => {
    expect(calculator.multiply(2, 3)).toBe(6);
    expect(calculator.multiply(-1, 5)).toBe(-5);
    expect(calculator.multiply(-2, -3)).toBe(6);
  });

  test('divides two numbers correctly', () => {
    expect(calculator.divide(6, 3)).toBe(2);
    expect(calculator.divide(-6, 3)).toBe(-2);
    expect(calculator.divide(0, 5)).toBe(0);
  });

  test('throws error when dividing by zero', () => {
    expect(() => {
      calculator.divide(5, 0);
    }).toThrow('Cannot divide by zero');
  });
});