package com.bird.service.common.configure.permission;

import com.bird.service.common.mapper.permission.DataRuleInfo;
import com.bird.service.common.mapper.permission.IDataRuleStore;
import com.bird.service.common.service.query.FilterGroup;

import java.util.Set;

/**
 * @author liuxx
 * @date 2018/10/10
 */
public class NullDataRuleStore implements IDataRuleStore {
    @Override
    public void store(Set<DataRuleInfo> rules) {

    }

    @Override
    public FilterGroup get(String userId, String... tables) {
        return null;
    }
}
