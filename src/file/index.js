const reg = /(?<!(^|-))(?=([0-9]{3})+($|\.))(?<!\..*)/g;

const reg4 = /(?<=(^|-))/g;

const reg1 = /[0-9]/g

const reg2 = /(?=([0-9]{3})+$)/g

const reg5 = /JDk[^(11)(17)]\d{1,2}/g;
const reg6 = /[a-d&&[def]]/g;


const str = '-111111.11111';
const str1 = "adadad"

console.log(str1.replace(reg6, ','));


// const obj = {
//   [Symbol('111')]: 1
// }

// console.log(Object.keys(obj));
// for (const key in obj) {
//   console.log(key);
// }
// for (const key of obj) {
//   console.log(key);
// }
console.log(str.replace(reg4, ','));

const arr = [3, 1, 5, 6, 7, 4, 8, 9];

for (let i = 0; i < arr.length - 1; i++) {
  for (let j = 0; j < arr.length - i - 1; j++) {
    if (arr[j] > arr[j + 1]) {
      [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]]
    }
  }
}

console.log(arr);