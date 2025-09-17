public class BlockSearch {
    // 块的定义：包含起始索引和最大值
    static class Block {
        int startIndex; // 块的起始索引
        int maxValue;   // 块的最大值
        Block(int startIndex, int maxValue) {
            this.startIndex = startIndex;
            this.maxValue = maxValue;
        }
    }
    // 分块查询主函数
    public static int blockSearch(int[] arr, int target, int blockSize) {
        // 构建索引表
        Block[] indexTable = buildIndexTable(arr, blockSize);
        // 第一步：在索引表中二分查找目标块
        int blockIndex = findBlock(indexTable, target);
        if (blockIndex == -1) {
            return -1; // 目标值大于所有块的最大值
        }
        // 第二步：在块内顺序查找
        int start = indexTable[blockIndex].startIndex;
        int end = Math.min(start + blockSize, arr.length);
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return i; // 找到目标，返回索引
            }
        }
        return -1; // 未找到目标
    }
    // 构建索引表
    private static Block[] buildIndexTable(int[] arr, int blockSize) {
        int blockCount = (int) Math.ceil((double) arr.length / blockSize);
        Block[] indexTable = new Block[blockCount];

        for (int i = 0; i < blockCount; i++) {
            int startIndex = i * blockSize;// 块的起始索引
            int endIndex = Math.min(startIndex + blockSize, arr.length);// 块的结束索引
            int maxValue = Integer.MIN_VALUE;// 块内的最大值
            // 找到块内最大值,假设每块内部无序
            for (int j = startIndex; j < endIndex; j++) {
                maxValue = Math.max(maxValue, arr[j]);
            }
            indexTable[i] = new Block(startIndex, maxValue);
        }
        return indexTable;
    }
    // 在索引表中二分查找目标块
    private static int findBlock(Block[] indexTable, int target) {
        int left = 0;
        int right = indexTable.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target <= indexTable[mid].maxValue) {
                // 如果目标小于等于当前块的最大值，继续检查左边
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // 返回第一个满足target <= maxValue的块索引
        if (left < indexTable.length) {
            return left;
        }
        return -1; // 目标值大于所有块的最大值
    }

    public static void main(String[] args) {
        // 示例数据：部分有序，假设每块内部无序
        int[] arr = {5, 3, 8, 1,  // 块1: max=8
                10, 7, 12, 4, // 块2: max=12
                15, 9, 20, 6}; // 块3: max=20
        int target = 12;
        int blockSize = 4;

        int result = blockSearch(arr, target, blockSize);
        if (result != -1) {
            System.out.println("元素 " + target + " 在索引 " + result);
        } else {
            System.out.println("元素 " + target + " 不存在");
        }
    }
}