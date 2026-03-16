# 584. Find Customer Referee

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/find-customer-referee/)

`Database`

## Intuition  
The requirement is to list customers whose `referee_id` is **not** 2, or who have no referee (`NULL`).  
In relational terms, this is a single filter condition on the `referee_id` column: keep rows where the referee is different from 2 or the referee is unknown.

## Approach  
The query scans the `Customer` table once and applies the predicate `referee_id <> 2 OR referee_id IS NULL`.  
- `referee_id <> 2` captures all customers not referred by the customer with id 2.  
- `referee_id IS NULL` captures customers with no referee.  
Because the two conditions are joined with `OR`, a row satisfying either condition is returned.  
The `SELECT name` clause projects only the `name` column, producing the desired result set.

## Complexity  
- **Time:** O(n) – each row is examined once to evaluate the predicate.  
- **Space:** O(1) – no additional data structures are created; only the output list is produced.

## Solution (mysql)

```sql
# Write your MySQL query statement below
SELECT name
FROM customer
WHERE referee_id <> 2 OR referee_id is NULL;
```

---

**Runtime** 470 ms · **Memory** 0.0B

<sub>Synced by AILeetHub on 2026-03-16.</sub>
