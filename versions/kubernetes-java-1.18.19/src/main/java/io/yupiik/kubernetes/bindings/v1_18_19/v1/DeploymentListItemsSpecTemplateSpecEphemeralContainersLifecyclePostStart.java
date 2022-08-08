package io.yupiik.kubernetes.bindings.v1_18_19.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                                    final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                                    final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
