-- LeetCode 1581 - Customer Who Visited but Did Not Make Any Transactions
select customer_id , count(customer_id) as count_no_trans 
from Visits left join Transactions 
 on visits.visit_id = Transactions.visit_id  WHERE Transactions.transaction_id IS NULL group by customer_id;