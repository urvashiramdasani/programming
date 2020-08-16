import java.util.Scanner;
class GSSArray
{
    int arr[];
    int size,count=0;
    GSSArray(int s)
    {
        size=s;
        arr=new int [size];
    }
    private void increaseSize()
    {
        int A[]=new int [2*size];
        for(int i=0;i<size;i++)
        {
            A[i]=arr[i];
        }
        arr=A;
    }
    void insert(int item)
    {
        int d,temp;
        if(count>=size)
            increaseSize();    
        arr[count]=item;
        for(int i=1;i<=count;i++)
        {
            d=i;
            while(d>0 && arr[d]<arr[d-1])
            {
                temp=arr[d];
                arr[d]=arr[d-1];
                arr[d-1]=temp;
                d--;
            }
        }
        count++;
    }
    boolean delete(int item)
    {
        for(int i=0;i<count;i++)
        {
            if(arr[i]==item)
            {
                for(int j=i;j<count-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                count--;
                return true;
            }
        }
        return false;
    }
    void display()
    {
        System.out.println("The elements in array are ");
        for(int i=0;i<count;i++)
        {
            System.out.print("\t"+arr[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,ch,ele;
        System.out.println("Enter the size of array: ");
        s=sc.nextInt();
        GSSArray g=new GSSArray(s);
        System.out.println("\n1. Insert \n2. Delete \n3. Display \n4. Quit\n Enter you choice: ");
        ch=sc.nextInt();
        do
        {
            switch(ch)
            {
                case 1: do
                        {
                            System.out.println("Enter the element in array: ");
                            ele=sc.nextInt();
                            if(ele!=-1)
                                g.insert(ele);
                        }while(ele!=-1);
                        ch=sc.nextInt();
                        break;    
                case 2: do
                        {
                            System.out.println("Enter the value to be deleted: ");
                            ele=sc.nextInt();
                            if(ele!=-1)
                                {
                                    boolean b=g.delete(ele);
                                    if(b==false)
                                        System.out.println("Element not found!");
                                    else
                                        System.out.println("Deletion Successful");
                                }
                        }while(ele!=-1);
                        ch=sc.nextInt();
                        break;
                case 3: g.display();
                        ch=sc.nextInt();
                        break;
                case 4: ch=4;
                        break;
                default: System.out.println("Invalid Choice!");
                        break;
            }
        }while(ch!=4);
    }
}