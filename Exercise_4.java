public class Exercise_4
{


    public static void main(String[] args)
    {
        LinkedIntList linkedIntList = new LinkedIntList();
        LinkedIntList linkedIntList1 = new LinkedIntList();

        linkedIntList.add(2);
        linkedIntList.add(2);
        linkedIntList.add(2);
        linkedIntList.add(3);
        linkedIntList.add(4);


        //System.out.println(lastIndexOf(linkedIntList,2));
        System.out.println(lastIndexOf(linkedIntList, 3));
    }


    public static int lastIndexOf(LinkedIntList linkedIntList, int value)
    {
        ListNode current = linkedIntList.getFront();
        int lastIndex = -1;
        {
            int listSize = linkedIntList.size();
            for (int i = 0; i < listSize; i++)
            {
                if (value == current.data)
                {
                    lastIndex = i;
                }
                current = current.next;
            }
        }
        return lastIndex;

    }
}
