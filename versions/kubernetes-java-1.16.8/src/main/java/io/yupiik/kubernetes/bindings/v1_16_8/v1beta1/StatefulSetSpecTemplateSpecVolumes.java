package io.yupiik.kubernetes.bindings.v1_16_8.v1beta1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumes {
    private StatefulSetSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private StatefulSetSpecTemplateSpecVolumesAzureDisk azureDisk;
    private StatefulSetSpecTemplateSpecVolumesAzureFile azureFile;
    private StatefulSetSpecTemplateSpecVolumesCephfs cephfs;
    private StatefulSetSpecTemplateSpecVolumesCinder cinder;
    private StatefulSetSpecTemplateSpecVolumesConfigMap configMap;
    private StatefulSetSpecTemplateSpecVolumesCsi csi;
    private StatefulSetSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private StatefulSetSpecTemplateSpecVolumesEmptyDir emptyDir;
    private StatefulSetSpecTemplateSpecVolumesFc fc;
    private StatefulSetSpecTemplateSpecVolumesFlexVolume flexVolume;
    private StatefulSetSpecTemplateSpecVolumesFlocker flocker;
    private StatefulSetSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private StatefulSetSpecTemplateSpecVolumesGitRepo gitRepo;
    private StatefulSetSpecTemplateSpecVolumesGlusterfs glusterfs;
    private StatefulSetSpecTemplateSpecVolumesHostPath hostPath;
    private StatefulSetSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private StatefulSetSpecTemplateSpecVolumesNfs nfs;
    private StatefulSetSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private StatefulSetSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private StatefulSetSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private StatefulSetSpecTemplateSpecVolumesProjected projected;
    private StatefulSetSpecTemplateSpecVolumesQuobyte quobyte;
    private StatefulSetSpecTemplateSpecVolumesRbd rbd;
    private StatefulSetSpecTemplateSpecVolumesScaleIO scaleIO;
    private StatefulSetSpecTemplateSpecVolumesSecret secret;
    private StatefulSetSpecTemplateSpecVolumesStorageos storageos;
    private StatefulSetSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public StatefulSetSpecTemplateSpecVolumes() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumes(final StatefulSetSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                              final StatefulSetSpecTemplateSpecVolumesAzureDisk azureDisk,
                                              final StatefulSetSpecTemplateSpecVolumesAzureFile azureFile,
                                              final StatefulSetSpecTemplateSpecVolumesCephfs cephfs,
                                              final StatefulSetSpecTemplateSpecVolumesCinder cinder,
                                              final StatefulSetSpecTemplateSpecVolumesConfigMap configMap,
                                              final StatefulSetSpecTemplateSpecVolumesCsi csi,
                                              final StatefulSetSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                              final StatefulSetSpecTemplateSpecVolumesEmptyDir emptyDir,
                                              final StatefulSetSpecTemplateSpecVolumesFc fc,
                                              final StatefulSetSpecTemplateSpecVolumesFlexVolume flexVolume,
                                              final StatefulSetSpecTemplateSpecVolumesFlocker flocker,
                                              final StatefulSetSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                              final StatefulSetSpecTemplateSpecVolumesGitRepo gitRepo,
                                              final StatefulSetSpecTemplateSpecVolumesGlusterfs glusterfs,
                                              final StatefulSetSpecTemplateSpecVolumesHostPath hostPath,
                                              final StatefulSetSpecTemplateSpecVolumesIscsi iscsi,
                                              final String name,
                                              final StatefulSetSpecTemplateSpecVolumesNfs nfs,
                                              final StatefulSetSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                              final StatefulSetSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                              final StatefulSetSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                              final StatefulSetSpecTemplateSpecVolumesProjected projected,
                                              final StatefulSetSpecTemplateSpecVolumesQuobyte quobyte,
                                              final StatefulSetSpecTemplateSpecVolumesRbd rbd,
                                              final StatefulSetSpecTemplateSpecVolumesScaleIO scaleIO,
                                              final StatefulSetSpecTemplateSpecVolumesSecret secret,
                                              final StatefulSetSpecTemplateSpecVolumesStorageos storageos,
                                              final StatefulSetSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final StatefulSetSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public StatefulSetSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final StatefulSetSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public StatefulSetSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final StatefulSetSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public StatefulSetSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final StatefulSetSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public StatefulSetSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final StatefulSetSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public StatefulSetSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final StatefulSetSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public StatefulSetSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final StatefulSetSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public StatefulSetSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final StatefulSetSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public StatefulSetSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final StatefulSetSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public StatefulSetSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final StatefulSetSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public StatefulSetSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final StatefulSetSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public StatefulSetSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final StatefulSetSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public StatefulSetSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final StatefulSetSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public StatefulSetSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final StatefulSetSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public StatefulSetSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final StatefulSetSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public StatefulSetSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final StatefulSetSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public StatefulSetSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final StatefulSetSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public StatefulSetSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final StatefulSetSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public StatefulSetSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final StatefulSetSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public StatefulSetSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final StatefulSetSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public StatefulSetSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final StatefulSetSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public StatefulSetSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final StatefulSetSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public StatefulSetSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final StatefulSetSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public StatefulSetSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final StatefulSetSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public StatefulSetSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final StatefulSetSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public StatefulSetSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final StatefulSetSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public StatefulSetSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final StatefulSetSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public StatefulSetSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final StatefulSetSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                cephfs,
                cinder,
                configMap,
                csi,
                downwardAPI,
                emptyDir,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                gitRepo,
                glusterfs,
                hostPath,
                iscsi,
                name,
                nfs,
                persistentVolumeClaim,
                photonPersistentDisk,
                portworxVolume,
                projected,
                quobyte,
                rbd,
                scaleIO,
                secret,
                storageos,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumes)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumes __otherCasted = (StatefulSetSpecTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(gitRepo, __otherCasted.gitRepo) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(persistentVolumeClaim, __otherCasted.persistentVolumeClaim) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(projected, __otherCasted.projected) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }
}
