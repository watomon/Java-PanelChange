//package TestGame;

import java.math.BigDecimal;
import framework.game2D.Map2D;

/**
 * ���H�Q�[���̃X�e�[�W�̃N���X
 * @author T.Kuno
 *
 */
public class MapStage extends Map2D {
	// �R���X�g���N�^
	public MapStage() {
		super(new String[]{
				"data\\RPG\\grass1.jpg", //0, �^���[���u����ꏊ
				"data\\RPG\\grass2.jpg", //1, �^���[��u�����ꏊ
				"data\\RPG\\road1.jpg", //2, �G�̒ʂ铹
				"data\\RPG\\tree.jpg",	//3, ����u���Ȃ��ꏊ
				"data\\RPG\\rock.jpg", //4, ���ꏊ
				"data\\RPG\\block.jpg"}, //5, �G���o�Ă���ꏊ
		3);
	}
	
	// ���ۃ��\�b�h�̎���
	//�@0�`6:�ړ��\�@7�ȏ�:��Q���@
	@Override
	public int[][] createMap() {
		int[][] map = {
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{ 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
							
		};
		return map;
	}

	public boolean checkGridPoint(Player mazeSpritePlayer) {
		// �ۂߌ덷�����p�ϐ��̐���
		double mazeSpritePositionX = new BigDecimal(mazeSpritePlayer
				.getPosition().getX()).setScale(1, BigDecimal.ROUND_DOWN)
				.doubleValue();
		double mazeSpritePositionY = new BigDecimal(mazeSpritePlayer
				.getPosition().getY()).setScale(1, BigDecimal.ROUND_DOWN)
				.doubleValue();
		
		// �X�e�[�W�̍\���I�u�W�F�N�g�̈ʒu�ƃv���C���[�̈ʒu���������ǂ��������肷��
		for (int i = 0; i < this.getStageObjectList().size(); i++) {
			if (
					mazeSpritePositionX == this.getStageObjectList().get(i).getPosition().getX()
					&& mazeSpritePositionY == this.getStageObjectList().get(i).getPosition().getY()
				){
				return true;
			}

		}
		return false;
	}
}
