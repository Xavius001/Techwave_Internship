function Check()
{
    var flag = true;
    var str = "";
    var ac = document.getElementsByName("acode")[0].value;
    var d = document.getElementsByName("dob")[0].value;
    var db = new Date(d);
    var now = new Date();
    ///(365.25*24*60*60*1000)
    var age = now.getFullYear()-db.getFullYear();
    var count = 0;
    if(ac.length==10)
    {
        for(i=0; i<10; i++)
        {
            if((i<4 || i>7) && ac.charCodeAt(i)>=65 && ac.charCodeAt(i)<=90)
            {
                count++;
            }
            else if(i>=4 && i<=7 && ac.charCodeAt(i)>=48 && ac.charCodeAt(i)<=57)
            {
                count++;
            }
        }
        if(count==10)
        {
            flag = true;
        }
        else
        {
            flag = false;
            str = "Invalid Access Code";
        }
    }
    else
    {
        flag = false;
        str = "Please enter an access code with 10 characters";
    }
    if(d.length==0)
    {
        flag = false;
        str = str + "\nPlease enter dob";
    }
    if(now.getMonth()<db.getMonth() || (now.getMonth()==db.getMonth() && now.getDate()<db.getDate()))
    {
        age--;
    }
    if(age<21)
    {
        flag = false;
        str = str + "\nYou must be at least 21 to join";
    }
    if(str.length!=0)
    {
        alert(str);
    }
    return flag;
}