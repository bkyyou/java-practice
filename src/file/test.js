// const d1 = require("../1.json");
// const d2 = require("../2.json");
// const d3 = require("../3.json");

// const idArr = [...d1.data.records, ...d2.data.records, ...d3.data.records].map(val => val.invoiceDetailId);

// console.log(idArr.length);
// console.log(new Set(idArr).size);
// if (idArr.length === new Set(idArr).size) {
//   console.log("等于");
// } else {
//   console.log("不等于");
// }

// const res = [];
// for (let i = 0; i < idArr.length-1; i++) {
//   if (idArr.slice(i+1).includes(idArr[i])) {
//     res.push(idArr[i]);
//   }
// }
// console.log([...new Set(res)]);

function fun(val) {
  try {
    new Promise((resovle, reject) => {
      // resovle(1111)
      reject(1111)
    })
    // .then(res => {
    //   return false
    // })
    // .then(res => {
    //   aaa()
    //   console.log(res + "111");
    // })
    .catch((err) => {
      // console.log(err);
      console.log('catch');
    })
  } catch (error) {
    // console.log(error);
    console.log("error");
  }
  console.log(222);
}

// fun()

const fun1 = async () => {
  const res = await fun2();
  console.log("fun1: " + res);
}

const fun2 = () => {
  return new Promise((resovle, reject) => {
    // reject(111)
    // console.log("不执行后续代码了");
    resovle("1122")
  })
  .then(res => {
    return res;
  }, res => {
    console.log('reject2');
  })
  .catch(() => {
    console.log("fun2 catch");
    // return Promise.reject();
  })
}

// fun1()

const reg = /^(-?\d+\.?\d{0,2})$/;
const str = "-2111110.aaa110001";
console.log(reg.test(str));


console.log(str.replace(reg, props => {
  console.log("---", props);
  return props;
}));

const newstr = str.replace(reg, "0")

// console.log(str);
// console.log(newstr);


const numFun = str => {
  const reg = /^-?\d+(\.\d{1,2})?$/;
  if (reg.test(str)) {
    return str
  } else {
    return "buxing"
  }
}

// console.log(numFun("-67.123"));

// new Promise((resolve) => {
//   console.log(234);
//   resolve(123);
//   console.log(1111);
// }).then(res => {
//   console.log(res);
// })

const matchTestReg = /./g;
const matchTestStr = "1234567890";
for (let i = 0; i < 4; i++) {
  // console.log(matchTestStr.match(matchTestReg));
}

const reg20230828 = /(?<!(^|-))(?=(\d{3})+($|\.))(?<!\..*)/g;
const reg20230828str = "1111111111.111111";
console.log(reg20230828str.replace(reg20230828, ","));
const reg20230828Pwd = /^((?=.*?\d)(?=.*?[a-z])|(?=.*?\d)(?=.*?[A-Z])|(?=.*?[A-Z])(?=.*?[a-z])).{6,}$/g;
const reg20230828Pwdstr = "1aaaaaaAaa";
console.log(reg20230828Pwd.test(reg20230828Pwdstr));





