class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        def student(students,sandwiches):
            if students[0]==sandwiches[0]:
                students.pop(0)
                sandwiches.pop(0)
            else:
                students.append(students.pop(0))
        while len(students)!=0:
            if sandwiches[0] not in students:
                return len(students)
            else:
                student(students,sandwiches)
        return len(students)