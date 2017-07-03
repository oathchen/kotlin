
/**
 * Created by oathchen on 2017/6/27.
 */
class PropertyExample{


    fun test(){

        var trie = mapOf<String,String>("key" to "ass we can")
//        assertEquals("ass we can", trie["key"].toString())


        trie["key"]!! shouldBe1 "ass we can"
    }



    infix inline fun  String.shouldBe1(expected: String) = assertEquals(expected, this)

     fun  assertEquals(s: String, ms:String):Boolean {

        if(s.equals(ms))
        {
            println("this is equal")
            return true
        }
        else{
            println("this is not equal")
            return false
        }

    }


}