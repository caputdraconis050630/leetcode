class Solution
{
public:
    int minCostClimbingStairs(vector<int> &cost)
    {
        deque<int> dynamic_cost;
        dynamic_cost.push_front(cost.back());
        for (int i = cost.size() - 2; i >= 0; i--)
        {
            int min_cost = cost[i];
            if (i == cost.size() - 2)
                ;
            else
                min_cost += min(dynamic_cost[0], dynamic_cost[1]);
            dynamic_cost.push_front(min_cost); // save cost
        }
        return min(dynamic_cost[0], dynamic_cost[1]);
    }
};