#include <iostream>
#include <string>
#include <vector>
#include <iomanip>

using namespace std;

// Function to calculate grade based on average score
string calculateGrade(double averageScore) {
    if (averageScore >= 90) return "A";
    if (averageScore >= 80) return "B";
    if (averageScore >= 70) return "C";
    if (averageScore >= 60) return "D";
    return "F";
}

int main() {
    int numStudents;
    
    // Prompt for number of students
    cout << "Enter the number of students: ";
    cin >> numStudents;
    
    // Process each student
    for (int i = 1; i <= numStudents; i++) {
        // Student details input
        cout << "Student " << i << endl;
        
        // Get student name
        string studentName;
        cout << "Enter student name: ";
        cin.ignore(); // Clear previous newline
        getline(cin, studentName);
        
        // Get number of subjects
        int numSubjects;
        cout << "Enter the number of subjects: ";
        cin >> numSubjects;
        
        // Vector to store subject scores
        vector<int> scores(numSubjects);
        int totalScore = 0;
        
        // Input scores for each subject
        for (int j = 1; j <= numSubjects; j++) {
            cout << "Enter score for subject " << j << ": ";
            cin >> scores[j-1];
            totalScore += scores[j-1];
        }
        
        // Calculate average score
        double averageScore = static_cast<double>(totalScore) / numSubjects;
        
        // Determine grade
        string grade = calculateGrade(averageScore);
        
        // Output student details in the required format
        cout << "Name: " << studentName << " Scores: ";
        for (int score : scores) {
            cout << score << " ";
        }
        cout << "Grade: " << grade << endl;
    }
    
    return 0;
}