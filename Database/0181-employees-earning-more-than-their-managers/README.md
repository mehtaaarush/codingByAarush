# 181. Employees Earning More Than Their Managers

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/employees-earning-more-than-their-managers/)

`Database`

## Intuition
We must identify employees whose salary exceeds that of their manager. Since every employee and manager are stored in the same `Employee` table, a self‑join lets us pair each employee with the row that represents their manager. Employees without a manager (`managerId = NULL`) naturally drop out of the join, so they are not considered.

## Approach
1. Alias the table twice: `e` for the employee and `m` for the manager.  
2. Join `e` to `m` on `e.managerId = m.id`. This produces a row for every employee that has a manager.  
3. Apply `WHERE e.salary > m.salary` to keep only those pairs where the employee earns more than the manager.  
4. Select `e.name` as `Employee`.  
The query relies on the database’s join engine to perform the pairing efficiently, and the filter is evaluated during the join phase.

## Complexity
- **Time:** O(n) – the join scans the table once and the filter is applied per matched pair.  
- **Space:** O

## Solution (mysql)

```sql
# Write your MySQL query statement below
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
ON e.managerId = m.id
WHERE e.salary > m.salary;
```

---

**Runtime** 423 ms · **Memory** 0.0B

<sub>Synced by AILeetHub on 2026-03-21.</sub>
