package com.my.package10;

//@Demo471MyAnno(per = Demo472Person.p1)
@Demo471MyAnno(anno2 = @Demo472MyAnno,strs = {"abc","bbb"})
@Demo473MyAnno
public class Demo472Worker {
    public void show () {

    }
}
