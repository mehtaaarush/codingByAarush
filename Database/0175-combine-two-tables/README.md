# 175. Combine Two Tables

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/combine-two-tables/)

`Database`

## Intuition  
We need every person from the `Person` table, along with their address if one exists. A left outer join naturally keeps all rows from the left table (`Person`) and attaches matching rows from the right table (`Address`). When no match is found, the joined columns become `NULL`, which is exactly the required behaviour for missing addresses.

## Approach  
1. **Select columns**: `firstName`, `lastName` from `Person`; `city`, `state` from `Address`.  
2. **Perform a LEFT JOIN**:  
   ```sql
   FROM Person
   LEFT JOIN Address
   ON Person.personId = Address.personId;
   ```  
   This matches rows on the common key `personId`.  
3. The query returns one row per person. If a person has no address, the `city` and `state` fields are `NULL`.  
4. The result can be returned in any order, so no `ORDER BY` clause is needed.

## Complexity  
- **Time:** O(n + m) – each table is scanned once during the join.  
- **Space:** O(n) – the output holds one row per person, plus any temporary structures used by the join engine.

## Solution (mysql)

```sql
# Write your MySQL query statement below
SELECT firstName, lastName, city, state
FROM Person
LEFT JOIN Address
ON Person.personId = Address.personId;
```

---

**Runtime** 573 ms · **Memory** 0.0B

<sub>Synced by AILeetHub on 2026-03-20.</sub>
