package io.yupiik.kubernetes.bindings.v1_15_8.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStart {
    private StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStart(final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                            final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                            final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
