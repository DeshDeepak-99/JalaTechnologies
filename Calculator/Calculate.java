package Calculator;

class Calculate implements iCalc{
    private char Operator;
    private iCalc iFNum,iSNum;
    private Double dblNumber=new Double(0);
    private Double dblResult=new Double(0);
    private int iResult=0;
    private boolean typeDouble=false;
    private boolean typeInteger=false;
    public Calculate()
    {}
    public Calculate(Double dblNum, char cOperator)
    {
        dblNumber=dblNum;
        Operator=cOperator;
        typeDouble=true;
    }

    public Calculate(int iFirstNum, char cOperator,iSecondNum)
    {
        iFNum=iFirstNum;
        iSNum=iSecondNum;
        Operator=cOperator;
        typeInt=true;

    }

    public void doCalculation()
    {
        iResult=0;
        dblResult=0.0;
        switch(Operator)
        {
            case '+':
                        checkInt();
                        iResult=iFNum+iSNum;
                        break;
            case '-':
                        checkInt();
                        iResult=iFNum-iSNum;
                        break;
            case '*':
                        checkInt();
                        iResult=iFNum*iSNum;
                        break;
            case '/':
                        checkInt();
                        if(!checkSecondNum())
                        {
                            iResult=iFNum/iSNum;
                            break;
                        }
            case 'S':
            case 's':
                        checkDouble();
                        dblResult=Math.sin(dblNumber);
                        break;
            case 'C':
            case 'c':
                        checkDouble();
                        dblResult=Math.cos(dblNumber);
                        break;
                        
        }
    }
}
