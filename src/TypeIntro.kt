class TypeIntro {
    var experiencePoints:Int
    val  playerName:String
    var hasSteed:Int? = null
    val magic:String

    constructor(experiencePoints:Int,playerName:String){
        this.experiencePoints=experiencePoints
        this.playerName=playerName
        magic=playerName.reversed()
    }


    fun add(addVal:Int){
        experiencePoints+=addVal
    }

    fun print(){
        println("experiencePoints= $experiencePoints")
        println("playerName is $playerName")
    }

    fun magicMirror(){
        println("Well Done! you have found the magic mirror that will show you your reflection---->    $magic")
    }

    fun hasThePlayerAquieredaDragon(){
       if(hasSteed!=null)
           println("you have a dragon")
        else
           println("you don't have a dragon yet")
        }
    }



fun main(){
   var player = TypeIntro(5,"Estragon")
    player.add(5)
    player.print()
    player.magicMirror()
    player.hasThePlayerAquieredaDragon()


}