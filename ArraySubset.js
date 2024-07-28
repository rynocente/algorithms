array1 = ["a","b","c","d","e","f"];
array2 = ["b","d","f"]; //true
//array2 = ["b","d","f","f"]; //false

let rpta = isSubset(array1, array2);
console.log("rpta: " + rpta);

function isSubset(array1, array2) {

    let largerArray;
    let smallerArray;
    let hashtable = {};

    if(array1.length > array2.length) {
        largerArray = array1;
        smallerArray = array2;
    }else {
        largerArray = array2;
        smallerArray = array1;
    }

    console.log("larger: " + largerArray);
    console.log("smaller: " + smallerArray);


    //store hashtable
    for(const key of largerArray) {
        hashtable[key] = true;
    }

    for(const key of smallerArray) {
        if(!hashtable[key]) {
            return false;
        }
    }

    return true;


}
