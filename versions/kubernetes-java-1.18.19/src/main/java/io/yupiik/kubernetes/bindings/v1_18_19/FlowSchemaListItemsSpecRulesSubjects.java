package io.yupiik.kubernetes.bindings.v1_18_19;

import java.util.Objects;

public class FlowSchemaListItemsSpecRulesSubjects {
    private FlowSchemaListItemsSpecRulesSubjectsGroup group;
    private String kind;
    private FlowSchemaListItemsSpecRulesSubjectsServiceAccount serviceAccount;
    private FlowSchemaListItemsSpecRulesSubjectsUser user;

    public FlowSchemaListItemsSpecRulesSubjects() {
        // no-op
    }

    public FlowSchemaListItemsSpecRulesSubjects(final FlowSchemaListItemsSpecRulesSubjectsGroup group,
                                                final String kind,
                                                final FlowSchemaListItemsSpecRulesSubjectsServiceAccount serviceAccount,
                                                final FlowSchemaListItemsSpecRulesSubjectsUser user) {
        // no-op
    }

    public FlowSchemaListItemsSpecRulesSubjectsGroup getGroup() {
        return group;
    }

    public void setGroup(final FlowSchemaListItemsSpecRulesSubjectsGroup group) {
        this.group = group;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public FlowSchemaListItemsSpecRulesSubjectsServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(final FlowSchemaListItemsSpecRulesSubjectsServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public FlowSchemaListItemsSpecRulesSubjectsUser getUser() {
        return user;
    }

    public void setUser(final FlowSchemaListItemsSpecRulesSubjectsUser user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                group,
                kind,
                serviceAccount,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlowSchemaListItemsSpecRulesSubjects)) {
            return false;
        }
        final FlowSchemaListItemsSpecRulesSubjects __otherCasted = (FlowSchemaListItemsSpecRulesSubjects) __other;
        return Objects.equals(group, __otherCasted.group) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(serviceAccount, __otherCasted.serviceAccount) &&
            Objects.equals(user, __otherCasted.user);
    }
}
