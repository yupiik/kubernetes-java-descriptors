package io.yupiik.kubernetes.bindings.v1_17_13;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStop {
    private StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStop(final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                                          final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                          final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
