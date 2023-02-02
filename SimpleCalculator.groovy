package com.groovypractice

println 'Hello user!'
println 'I am Groovy two number Calculator'

println 'Give me the first number?'

def num1 = System.in.newReader().readLine() as int

println 'And now Give me the second number?'

def num2 = System.in.newReader().readLine() as int

println 'Choose a magnificent calculus operation to perform:'

println '1. Add ' +"\n" + '2. Subtract' +"\n"+ '3. Divide' +"\n"+ '4. Multiply' +"\n"+ '5. Squared and added'

def choice = System.in.newReader().readLine() as int
float outcome = 0
switch(choice)
{
    case 1:
        outcome = num1 + num2
        break
    case 2:
        outcome = num1 - num2
        break
    case 3:
        outcome = num1 / num2
        break
    case 4:
        outcome = num1 * num2
        break
    case 5:
        outcome = num1 * num1 + num2 * num2
        break
}

println 'The result is: ' + outcome