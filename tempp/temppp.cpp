#include <iostream>
#include <string.h>
#include <math.h>
#include <vector>
#include <algorithm>
using namespace std;

bool isValidCharacter(char ch)
{
    return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'));
}

char toLowercase(char ch)
{
    if (ch >= 'A' && ch <= 'Z')
    {
        return (char)(ch - 'A' + 'a');
    }
    return ch;
}

string reverseName(string name)
{
    return string(name.rbegin(), name.rend());
}

bool isPalindrome(string name)
{
    int start = 0;
    int end = name.length() - 1;
    while (start <= end)
    {
        if (name[start] != name[end])
        {
            cout << "s " << name[start] << endl;
            cout << name[end] << endl;
            return false;
        }
        else
        {
            start++;
            end--;
        }
    }
    return true;
}

int showLength(string name)
{
    return name.length();
}

int main()
{

    string s;
    cin >> s;

    string temp = "";
    for (int i = 0; i < s.length(); i++)
    {
        if (faltucharacter(s[i]))
        {
            temp.push_back(s[i]);
        }
    }

    cout << temp << endl;
    cout << "convert character into lowercase" << endl;
    cout << "temp len " << temp.length() << endl;
    for (int j = 0; j < temp.length(); j++)
    {
        temp[j] = toLowercase(temp[j]);
    }
    cout << temp << endl;

    cout << "check palindrome" << endl;
    if (ispalindrome(temp))
    {
        cout << "it is a palindrome " << endl;
    }
    else
    {
        cout << "it is not a palindrome " << endl;
    }

    return 0;
}