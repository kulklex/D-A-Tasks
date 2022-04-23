function stringtest() {
    let data = 'attainarrow';
    let charArray = data.split('');
    console.log("characters: ", charArray)
    let newHash = new Map([]);
    for (let char of charArray){
        if (newHash.get(char) == null){
            newHash.set(char, 1);
        }else{
            newHash.set(char, newHash.get(char) + 1);
        }   
    }
    console.log("Here: ", newHash);
    
    let vals = [];
    for (const [key, value] of newHash){
        if (value > 1){
            vals.push(key);
        }
    }
    console.log("Duplicate Strings are: ", vals.join())
}

stringtest()