var party= '{“playerParty”:party, “enemyParty”:party}'

var playerParty=
    '{"name":”Shannon”, ' +
    '"hp":100, ' +
    '"maxHP":100, ' +
    '“battleOptions”: ["Power Punch","Roundhouse Kick","Throw a Rock","Heal"]}]}'+

    '{“name”:”Matt”, ' +
    '“hp”:100,' +
    ' “maxHP”:100,' +
    ' “battleOptions”: ["Power Punch","Roundhouse Kick","Throw a Rock","Heal"]}]}'+

    '{“name”:”Bruce”,' +
    ' “hp”:100,' +
    ' “maxHP”:100, ' +
    '“battleOptions”: ["Power Punch","Roundhouse Kick","Throw a Rock","Heal"]}]}'+

    '{“name”:”Norman”, ' +
    '“hp”:100,' +
    ' “maxHP”:100,' +
    ' “battleOptions”: ["Power Punch","Roundhouse Kick","Throw a Rock","Heal"]}]}';

var enemyParty=
'{“name”:”Caroline”, ' +
    '“hp”:100, ' +
    '“maxHP”:100, ' +
    '“battleOptions”: ["Power Punch","Roundhouse Kick","Throw a Rock","Heal"]}]}'+

'{“name”:”Tom”,' +
    ' “hp”:100,' +
    ' “maxHP”:100,' +
    ' “battleOptions”: ["Power Punch","Roundhouse Kick","Throw a Rock","Heal"]}]}'+

'{“name”:”Olivia”,' +
    ' “hp”:100,' +
    ' “maxHP”:100, ' +
    '“battleOptions”: ["Power Punch","Roundhouse Kick","Throw a Rock","Heal"]}]}'+

'{“name”:”Vada”, ' +
    '“hp”:100,' +
    ' “maxHP”:100,' +
    ' “battleOptions”: ["Power Punch","Roundhouse Kick","Throw a Rock","Heal"]}]}}]}]';


var curAttack=[]
var len=curAttack.length
var obj1= JSON.stringify(playerParty);
var obj2= JSON.stringify(enemyParty);

//var names= obj2.keys('name');
var hp= 100;
var moves= obj2.battleOptions;


function findPlayers() {
    var p1=names[0];
    var player1 = document.getElementById("player1").innerHTML=p1;
    var p2=names[1];
    var player2 = document.getElementById("player2").innerHTML=p2;
    var p3=names[2];
    var player3 = document.getElementById("player3").innerHTML=p3;
    var p4=names[3];
    var player4 = document.getElementById("player4").innerHTML=p4;

}

function powerPunch(){
    curAttack=["Power Punch"];
    update()
}

function roundhouseKick(){
    curAttack=["Roundhouse Kick"];
    update()
}

function throwaRock(){
    curAttack=["Throw a Rock"];
    update()
}

function heal(){
    curAttack=["Heal"];
    update()
}


function update(hp){
    for (var i=0 ;i< len;i++) {
         if (i ==="Power Punch") {
             hp=hp-20;
             document.getElementById("demo").innerHTML = hp;
            } else if (i === "Roundhouse Kick") {
             hp=hp-10;
             document.getElementById("demo").innerHTML = hp;
            } else if (i === "Throw a Rock") {
             hp=hp-25;
             document.getElementById("demo").innerHTML = hp;
            } else if (i === "Heal") {
             if (hp <= 95) {
                 hp = hp + 5;
             } else {
                 hp = 100;
             }
             document.getElementById("demo").innerHTML = hp;
         }
        }console.log(hp)
}

function takeTurn(){

    if (document.getElementById("pp").clicked === true){
        powerPunch()
    }
    document.getElementById("rk").clicked===true;{
        roundhouseKick()
    }
    document.getElementById("tr").clicked===true;{
        throwaRock()
    }
    document.getElementById("hl").clicked===true;{
        heal()
    }

}







