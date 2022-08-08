package io.yupiik.kubernetes.bindings.v1_22_9.v1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumes {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesAzureDisk azureDisk;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesAzureFile azureFile;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfs cephfs;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinder cinder;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesConfigMap configMap;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCsi csi;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEmptyDir emptyDir;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeral ephemeral;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesFc fc;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesFlexVolume flexVolume;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesFlocker flocker;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesGitRepo gitRepo;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesGlusterfs glusterfs;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesHostPath hostPath;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesNfs nfs;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjected projected;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesQuobyte quobyte;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesRbd rbd;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesScaleIO scaleIO;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesSecret secret;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesStorageos storageos;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumes() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumes(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesAzureDisk azureDisk,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesAzureFile azureFile,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfs cephfs,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinder cinder,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesConfigMap configMap,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCsi csi,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEmptyDir emptyDir,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeral ephemeral,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesFc fc,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesFlexVolume flexVolume,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesFlocker flocker,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesGitRepo gitRepo,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesGlusterfs glusterfs,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesHostPath hostPath,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesIscsi iscsi,
                                                                  final String name,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesNfs nfs,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjected projected,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesQuobyte quobyte,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesRbd rbd,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesScaleIO scaleIO,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesSecret secret,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesStorageos storageos,
                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
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
                ephemeral,
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumes)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumes __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(ephemeral, __otherCasted.ephemeral) &&
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
