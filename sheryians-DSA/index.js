//! SET ALWAYS HAS UNIQE VALUE 

let set=new Set()
set.add(10)
set.add(10)
set.add(30)
set.add(20)
/**==============================================
 * !                  only deffrent value accept set 
 *   
 *   
 *   
 *
 *=============================================**/

//NOTE - set methode are diffrent 
set.delete(20)//we have to pass elemtn not index  
//REVIEW - how to check elemt its existe or not 
console.log(set.has(10));//NOTE - if note exiest then send true 
console.log(set.has(200));//NOTE - 200 is not exiest then return false 

console.log(set); //! it will not acccept the not value 
