package core.basesyntax.operations;

import core.basesyntax.storage.Storage;
import java.util.Map;

public class SupplingTransactionExecutor implements TransactionExecutor {
    private Map<String, Integer> fruitMap = Storage.FRUIT_MAP;

    @Override
    public void execute(core.basesyntax.service.FruitTransaction fruitTransaction) {
        String fruit = fruitTransaction.getFruit();
        Integer supplingValue = fruitTransaction.getQuantity();

        if (fruitMap.containsKey(fruit)) {
            supplingValue = fruitMap.get(fruit) + supplingValue;
        }
        fruitMap.put(fruit, supplingValue);
    }
}
