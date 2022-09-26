function Func1()
 {
            var flag = true;
            var str = "";
            //fetch the control value from HTML to Javascript by using Id
           // var a = document.getElementById("empno").value; //100
            var eno = document.getElementsByName("empno")[0].value;
            var ename = document.getElementsByName("ename")[0].value;

            if(eno.length==0) //3!=0
            {
                flag = false;
                str = "Please enter employeeno";
            }
            if(ename.length==0) //3!=0
            {
                flag = false;
                str = str + "\nPlease enter employeename";
            }

            var g = 0;
            for(i=0; i<3;i++)
            {
                if(document.getElementsByName("gender")[i].checked)
                    g = 1;
            }

            if(g==0)
            {
                flag=false;
                str=str+"\nSelect gender";
            }

            var s = 0;
            for(i=0; i<3;i++)
            {
                if(document.getElementsByName("Skills")[i].checked)
                    s++;
            }
            if(s==0)
            {
                flag=false;
                str=str+"\nSelect skill";
            }
            if(str.length!=0)
            {
                alert(str);
            }
            return flag;
}