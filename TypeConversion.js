let num=String(7)
let str=Number("123")
let y=parseInt("123 Gayatri")
console.log(str,typeof str)
console.log(y,typeof y)

//coercion

let x=8
x=x+" "
console.log(x,typeof x)
x=+x+2 // on x+2 it will give 82
console.log(x,typeof x)
x=x-2
console.log(x,typeof x)
x=!x
console.log(x,typeof x)
console.log(Boolean(1)) //NaN,Null,0,undefined,""(empty string) will give false 