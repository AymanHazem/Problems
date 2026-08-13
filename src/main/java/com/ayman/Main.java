void main()
{
    System.out.println(findTheDifferenceV1("a","aa"));
}
public char findTheDifferenceV1(String s, String t)
{
    char c = 0;
    for(char cs : s.toCharArray()) c ^= cs;
    for(char ct : t.toCharArray()) c ^= ct;
    return c;
}