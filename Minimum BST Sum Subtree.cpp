class Solution {
public:
    int minSubtreeSum = INT_MAX;

int minSubtreeSumBST(int target, Node* root) {
    minSubtreeSum = INT_MAX;
    solve(root, target);
    if (minSubtreeSum == INT_MAX) {
        return -1;
    }
    return minSubtreeSum;
}

bool checkBST(Node* root, int minVal, int maxVal) {
    if (root == nullptr) {
        return true;
    }
    if (root->data < minVal || root->data > maxVal) {
        return false;
    }
    return checkBST(root->left, minVal, root->data - 1) && checkBST(root->right, root->data + 1, maxVal);
}

int getSum(Node* root, int* count) {
    if (root == nullptr) {
        return 0;
    }
    if (root->left == nullptr && root->right == nullptr) {
        count[0]++;
        return root->data;
    }
    count[0]++;
    return root->data + getSum(root->left, count) + getSum(root->right, count);
}

void solve(Node* root, int target) {
    if (root == nullptr) {
        return;
    }
    if (root->left == nullptr && root->right == nullptr) {
        if (root->data == target) {
            minSubtreeSum = 1;
            return;
        }
    }
    if (checkBST(root, INT_MIN, INT_MAX)) {
        int count[] = {0};
        int sum = getSum(root, count);
        if (sum == target) {
            minSubtreeSum = std::min(minSubtreeSum, count[0]);
        }
    }
    solve(root->left, target);
    solve(root->right, target);
}
};
