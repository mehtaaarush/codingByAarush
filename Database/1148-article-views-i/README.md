# 1148. Article Views I

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/article-views-i/)

`Database`

## Intuition
The problem asks for authors who have viewed at least one of their own articles.  
Each row in the `Views` table contains the author of the article, the viewer, and the date of the view.  
If the `author_id` and `viewer_id` in a row are equal, that row represents an author viewing their own article.  
Thus, the task reduces to finding all distinct `author_id`s that appear in such rows.

## Approach
The solution scans the entire `Views` table once.  
For every row it checks the condition `author_id = viewer_id`.  
When the condition holds, the `author_id` is added to a result set.  
Using `DISTINCT` ensures that each author appears only once, even if they have multiple qualifying rows.  
Finally, the result set is sorted in ascending order by the author id, as required.

## Complexity
- **Time:** O(n) – one pass over all rows, constant‑time work per row.  
- **Space:** O(k) – where k is the number of distinct authors who viewed their own articles, needed to store the result set.

## Solution (mysql)

```sql
# Write your MySQL query statement below
SELECT DISTINCT author_id AS id
FROM Views 
WHERE author_id = viewer_id
ORDER BY id;
```

---

**Runtime** 473 ms · **Memory** 0.0B

<sub>Synced by AILeetHub on 2026-03-18.</sub>
